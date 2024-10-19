import java.util.*;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.chart.Chart;
import com.vaadin.flow.component.chart.model.ChartType;
import com.vaadin.flow.component.chart.model.ListSeries;
import com.vaadin.flow.component.chart.model.XAxis;
import com.vaadin.flow.component.chart.model.YAxis;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.chart.model.DataSeries;
import com.vaadin.flow.component.chart.model.DataSeriesItem;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        // Create a dropdown for selecting a city
        ComboBox<String> cityComboBox = new ComboBox<>("Select City");
        cityComboBox.setItems("San Francisco", "New York City");

        // Create a dropdown for selecting a fruit
        ComboBox<String> fruitComboBox = new ComboBox<>("Select Fruit");
        fruitComboBox.setItems("Apples", "Oranges", "Bananas");

        // Default values
        cityComboBox.setValue("San Francisco");
        fruitComboBox.setValue("Apples");

        // Create the chart
        Chart chart = new Chart(ChartType.COLUMN);

        // Configure X-Axis
        XAxis xAxis = new XAxis();
        xAxis.setCategories("Fruits");
        chart.getConfiguration().addxAxis(xAxis);

        // Configure Y-Axis
        YAxis yAxis = new YAxis();
        yAxis.setTitle("Amount");
        chart.getConfiguration().addyAxis(yAxis);

        // Update chart data based on selections
        updateChart(chart, cityComboBox.getValue(), fruitComboBox.getValue());

        // Add listeners to dropdowns
        cityComboBox.addValueChangeListener(event -> {
            updateChart(chart, event.getValue(), fruitComboBox.getValue());
        });

        fruitComboBox.addValueChangeListener(event -> {
            updateChart(chart, cityComboBox.getValue(), event.getValue());
        });

        // Add components to the layout
        add(cityComboBox, fruitComboBox, chart);
    }

    private void updateChart(Chart chart, String selectedCity, String selectedFruit) {
        chart.getConfiguration().getSeries().clear();

        // Example data
        int amount = 0;
        if ("San Francisco".equals(selectedCity)) {
            switch (selectedFruit) {
                case "Apples":
                    amount = 4;
                    break;
                case "Oranges":
                    amount = 1;
                    break;
                case "Bananas":
                    amount = 2;
                    break;
            }
        } else if ("New York City".equals(selectedCity)) {
            switch (selectedFruit) {
                case "Apples":
                    amount = 2;
                    break;
                case "Oranges":
                    amount = 4;
                    break;
                case "Bananas":
                    amount = 5;
                    break;
            }
        }

        DataSeries series = new DataSeries();
        series.add(new DataSeriesItem(selectedFruit, amount));
        chart.getConfiguration().addSeries(series);
    }
}
