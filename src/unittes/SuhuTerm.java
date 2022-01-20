/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittes;

import konversisuhu.*;
import unittes.KonversiAllSuhu;
/**
 *
 * @author acer
 */
public class SuhuTerm {
    protected double hasil;
    KonversiAllSuhu Konversi = new KonversiAllSuhu();
    protected void selectInputCelcius(String input){
        if (Konversi.inputCelciusRadioButton.isSelected() && Konversi.outputCelciusRadioButton.isSelected()) {
            Konversi.inputLabel.setText("Celcius");
            Konversi.outputLabel.setText("Celcius");
            //hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText());
            hasil = Double.parseDouble(input);
            //new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (Konversi.inputCelciusRadioButton.isSelected() && Konversi.outputFahrenheitRadioButton.isSelected()) {
            Konversi.inputLabel.setText("Celcius");
            Konversi.outputLabel.setText("Fahrenheit");
            hasil = (Double.parseDouble(input) * 1.8) + 32;
            //hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) * 1.8) + 32;
            //new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (Konversi.inputCelciusRadioButton.isSelected() && Konversi.outputKelvinRadioButton.isSelected()) {
            Konversi.inputLabel.setText("Celcius");
            Konversi.outputLabel.setText("Kelvin");
            hasil = Double.parseDouble(input +  273.15);
            //hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) + 273.15);
            //new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (Konversi.inputCelciusRadioButton.isSelected() && Konversi.outputReamurRadioButton.isSelected()) {
            Konversi.inputLabel.setText("Celcius");
            Konversi.outputLabel.setText("Reamur");
            hasil = (Double.parseDouble(input) * 0.8);
            //hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) * 0.8);
           //new KonversiAllSuhu(). textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } 
    }
    
    protected void selectInputFahrenheit(){
        if (new KonversiAllSuhu().inputFahrenheitRadioButton.isSelected() && new KonversiAllSuhu().outputCelciusRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Fahrenheit");
            new KonversiAllSuhu().outputLabel.setText("Celcius");
            hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) - 32) / 1.8;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (new KonversiAllSuhu().inputFahrenheitRadioButton.isSelected() && new KonversiAllSuhu().outputFahrenheitRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Fahrenheit");
            new KonversiAllSuhu().outputLabel.setText("Fahrenheit");
            hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText());
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (new KonversiAllSuhu().inputFahrenheitRadioButton.isSelected() && new KonversiAllSuhu().outputKelvinRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Fahrenheit");
            new KonversiAllSuhu().outputLabel.setText("Kelvin");
            hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) + 459.67) / 1.8;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } else if (new KonversiAllSuhu().inputFahrenheitRadioButton.isSelected() && new KonversiAllSuhu().outputReamurRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Fahrenheit");
            new KonversiAllSuhu().outputLabel.setText("Reamur");
            hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) - 32) / 2.25;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f",hasil)));
        } 
    }
    
    protected void selectInputKelvin(){
        if (new KonversiAllSuhu().inputKelvinRadioButton.isSelected() && new KonversiAllSuhu().outputCelciusRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Kelvin");
            new KonversiAllSuhu().outputLabel.setText("Celcius");
            hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText()) - 273.15;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
        } else if (new KonversiAllSuhu().inputKelvinRadioButton.isSelected() && new KonversiAllSuhu().outputFahrenheitRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Kelvin");
            new KonversiAllSuhu().outputLabel.setText("Fahrenheit");
            hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) * 1.8) - 459.67;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
        } else if (new KonversiAllSuhu().inputKelvinRadioButton.isSelected() && new KonversiAllSuhu().outputKelvinRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Kelvin");
            new KonversiAllSuhu().outputLabel.setText("Kelvin");
            hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText());
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
        } else if (new KonversiAllSuhu().inputKelvinRadioButton.isSelected() && new KonversiAllSuhu().outputReamurRadioButton.isSelected()) {
            new KonversiAllSuhu().inputLabel.setText("Kelvin");
            new KonversiAllSuhu().outputLabel.setText("Reamur");
            hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) - 273.15) * 0.8;
            new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
        } 
    }
    
   protected void selectInputReamur(){
       if (new KonversiAllSuhu().inputReamurRadioButton.isSelected() && new KonversiAllSuhu().outputCelciusRadioButton.isSelected()) {
           new KonversiAllSuhu().inputLabel.setText("Reamur");
           new KonversiAllSuhu().outputLabel.setText("Celcius");
           hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText()) / 0.8;
           new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
       } else if (new KonversiAllSuhu().inputReamurRadioButton.isSelected() && new KonversiAllSuhu().outputFahrenheitRadioButton.isSelected()) {
           new KonversiAllSuhu().inputLabel.setText("Reamur");
           new KonversiAllSuhu().outputLabel.setText("Fahrenheit");
           hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) - 7.5) * 24 / 7 +32;
           new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
       } else if (new KonversiAllSuhu().inputReamurRadioButton.isSelected() && new KonversiAllSuhu().outputKelvinRadioButton.isSelected()) {
           new KonversiAllSuhu().inputLabel.setText("Reamur");
           new KonversiAllSuhu().outputLabel.setText("Kelvin");
           hasil = (Double.parseDouble(new KonversiAllSuhu().textInput.getText()) / 0.8) + 273.15;
           new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
       } else if (new KonversiAllSuhu().inputReamurRadioButton.isSelected() && new KonversiAllSuhu().outputReamurRadioButton.isSelected()) {
           new KonversiAllSuhu().inputLabel.setText("Reamur");
           new KonversiAllSuhu().outputLabel.setText("Reamur");
           hasil = Double.parseDouble(new KonversiAllSuhu().textInput.getText());
           new KonversiAllSuhu().textOutput.setText(String.valueOf(String.format("%.2f", hasil)));
       } 
   } 

}
