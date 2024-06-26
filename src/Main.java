import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;



public class Main extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        VBox vbox = new VBox();
        HBox hbox = new HBox();

        // Erstellen Sie ein Label für die Anzeige
        Label display = new Label();
        display.setText(ergebnisString);
        // Setzen Sie die Größe für die Anzeige
        display.setStyle("-fx-font-size: 26;");
        display.setPrefWidth(390);
        display.setPrefHeight(100);
        display.setAlignment(Pos.CENTER);

        // Hinzufügen des Labels zur oberen Zelle
        hbox.getChildren().add(display);

        // Erstellen Sie ein Label für die untere Zelle
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.BASELINE_CENTER);

        Button prozent = new Button();
        prozent.setText("%");
        GridPane.setRowIndex(prozent, 0);
        GridPane.setColumnIndex(prozent, 0);
        prozent.setPrefHeight(80);
        prozent.setPrefWidth(80);
        prozent.setOnAction(event ->
        {
            cacheInputOperation.clear();
            display.setText(cacheInputNumber.get(0) + "%");
            ergebnisString = cacheInputNumber.get(0) + "%";
            displayString += "" + prozent.getText() + " ";
            cacheInputOperation.clear();
            cacheInputOperation.add("Prozent");
            ergebnisString = "0";
        });

        Button wurzel = new Button();
        wurzel.setText("√");
        GridPane.setRowIndex(wurzel, 0);
        GridPane.setColumnIndex(wurzel, 1);
        wurzel.setPrefHeight(80);
        wurzel.setPrefWidth(80);
        wurzel.setOnAction(event ->
        {
            cacheInputOperation.clear();
            cacheInputOperation.add("Wurzel");
        });

        Button quadrat = new Button();
        quadrat.setText("²");
        GridPane.setRowIndex(quadrat, 0);
        GridPane.setColumnIndex(quadrat, 2);
        quadrat.setPrefHeight(80);
        quadrat.setPrefWidth(80);
        quadrat.setOnAction(event ->
        {
            display.setText(cacheInputNumber.get(0) + "²");
            ergebnisString = cacheInputNumber.get(0) + "²";
            displayString += "" + quadrat.getText() + "";
            cacheInputOperation.clear();
            cacheInputOperation.add("Quadrat");
            ergebnisString = "0";
        });

        Button einsdurchx = new Button();
        einsdurchx.setText("1/x");
        GridPane.setRowIndex(einsdurchx, 0);
        GridPane.setColumnIndex(einsdurchx, 3);
        einsdurchx.setPrefHeight(80);
        einsdurchx.setPrefWidth(80);
        einsdurchx.setOnAction(event ->
        {
            cacheInputOperation.clear();
            cacheInputOperation.add("EinsDurchX");
        });

        Button cleareverything = new Button();
        cleareverything.setText("CE");
        GridPane.setRowIndex(cleareverything, 1);
        GridPane.setColumnIndex(cleareverything, 0);
        cleareverything.setPrefHeight(80);
        cleareverything.setPrefWidth(80);
        cleareverything.setOnAction(event ->
        {
            cacheResults.clear();
            cacheInputOperation.clear();
            cacheInputNumber.clear();
            ergebnisString = "0";
            display.setText(ergebnisString);
        });

        Button clear = new Button();
        clear.setText("C");
        GridPane.setRowIndex(clear, 1);
        GridPane.setColumnIndex(clear, 1);
        clear.setPrefHeight(80);
        clear.setPrefWidth(80);
        clear.setOnAction(event ->
        {
            ergebnisString = "0";
            display.setText(ergebnisString);
        });

        Button removeLastChar = new Button();
        removeLastChar.setText("RMLC");
        GridPane.setRowIndex(removeLastChar, 1);
        GridPane.setColumnIndex(removeLastChar, 2);
        removeLastChar.setPrefHeight(80);
        removeLastChar.setPrefWidth(80);
        removeLastChar.setOnAction(event ->
        {
            cacheInputOperation.clear();
            cacheInputOperation.add("RemoveLastChar");
        });

        Button divide = new Button();
        divide.setText("/");
        GridPane.setRowIndex(divide, 1);
        GridPane.setColumnIndex(divide, 3);
        divide.setPrefHeight(80);
        divide.setPrefWidth(80);
        divide.setOnAction(event ->
        {
            display.setText(cacheInputNumber.get(0) + " / ");
            ergebnisString = cacheInputNumber.get(0) + " / ";
            displayString += " " + divide.getText() + " ";
            cacheInputOperation.clear();
            cacheInputOperation.add("Division");
            ergebnisString = "0";
        });

        Button seven = new Button();
        seven.setText("7");
        GridPane.setRowIndex(seven, 2);
        GridPane.setColumnIndex(seven, 0);
        seven.setPrefHeight(80);
        seven.setPrefWidth(80);
        seven.setOnAction(event ->
        {
            displayString += seven.getText();
            changeDisplayChar("7");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button eight = new Button();
        eight.setText("8");
        GridPane.setRowIndex(eight, 2);
        GridPane.setColumnIndex(eight, 1);
        eight.setPrefHeight(80);
        eight.setPrefWidth(80);
        eight.setOnAction(event ->
        {
            displayString += eight.getText();
            changeDisplayChar("8");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button nine = new Button();
        nine.setText("9");
        GridPane.setRowIndex(nine, 2);
        GridPane.setColumnIndex(nine, 2);
        nine.setPrefHeight(80);
        nine.setPrefWidth(80);
        nine.setOnAction(event ->
        {
            displayString += nine.getText();
            changeDisplayChar("9");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);

        });

        Button multiply = new Button();
        multiply.setText("*");
        GridPane.setRowIndex(multiply, 2);
        GridPane.setColumnIndex(multiply, 3);
        multiply.setPrefHeight(80);
        multiply.setPrefWidth(80);
        multiply.setOnAction(event ->
        {
            display.setText(cacheInputNumber.get(0) + " * ");
            ergebnisString = cacheInputNumber.get(0) + " * ";
            displayString += " " + multiply.getText() + " ";
            cacheInputOperation.clear();
            cacheInputOperation.add("Multiplikation");
            ergebnisString = "0";
        });


        Button four = new Button();
        four.setText("4");
        GridPane.setRowIndex(four, 3);
        GridPane.setColumnIndex(four, 0);
        four.setPrefHeight(80);
        four.setPrefWidth(80);
        four.setOnAction(event ->
        {
            displayString += four.getText();
            changeDisplayChar("4");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);

        });


        Button five = new Button();
        five.setText("5");
        GridPane.setRowIndex(five, 3);
        GridPane.setColumnIndex(five, 1);
        five.setPrefHeight(80);
        five.setPrefWidth(80);
        five.setOnAction(event ->
        {
            displayString += five.getText();
            changeDisplayChar("5");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button six = new Button();
        six.setText("6");
        GridPane.setRowIndex(six, 3);
        GridPane.setColumnIndex(six, 2);
        six.setPrefHeight(80);
        six.setPrefWidth(80);
        six.setOnAction(event ->
        {

            displayString += six.getText();
            changeDisplayChar("6");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button minus = new Button();
        minus.setText("-");
        GridPane.setRowIndex(minus, 3);
        GridPane.setColumnIndex(minus, 3);
        minus.setPrefHeight(80);
        minus.setPrefWidth(80);
        minus.setOnAction(event ->
        {
            display.setText(cacheInputNumber.get(0) + " - ");
            ergebnisString = cacheInputNumber.get(0) + " - ";
            displayString += " " + minus.getText() + " ";
            cacheInputOperation.clear();
            cacheInputOperation.add("Minus");
            ergebnisString = "0";
        });

        Button one = new Button();
        one.setText("1");
        GridPane.setRowIndex(one, 4);
        GridPane.setColumnIndex(one, 0);
        one.setPrefHeight(80);
        one.setPrefWidth(80);
        one.setOnAction(event ->
        {
            displayString += one.getText();
            changeDisplayChar("1");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button two = new Button();
        two.setText("2");
        GridPane.setRowIndex(two, 4);
        GridPane.setColumnIndex(two, 1);
        two.setPrefHeight(80);
        two.setPrefWidth(80);
        two.setOnAction(event ->
        {
            displayString += two.getText();
            changeDisplayChar("2");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button three = new Button();
        three.setText("3");
        GridPane.setRowIndex(three, 4);
        GridPane.setColumnIndex(three, 2);
        three.setPrefHeight(80);
        three.setPrefWidth(80);
        three.setOnAction(event ->
        {
            displayString += three.getText();
            changeDisplayChar("3");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button plus = new Button();
        plus.setText("+");
        GridPane.setRowIndex(plus, 4);
        GridPane.setColumnIndex(plus, 3);
        plus.setPrefHeight(80);
        plus.setPrefWidth(80);
        plus.setOnAction(event ->
        {
            display.setText(cacheInputNumber.get(0) + " + ");
            ergebnisString = cacheInputNumber.get(0) + " + ";
            displayString += " " + plus.getText() + " ";
            cacheInputOperation.clear();
            cacheInputOperation.add("Addition");
            ergebnisString = "0";
        });

        Button negate = new Button();
        negate.setText("±");
        GridPane.setRowIndex(negate, 5);
        GridPane.setColumnIndex(negate, 0);
        negate.setPrefHeight(80);
        negate.setPrefWidth(80);
        negate.setOnAction(event ->
        {
            cacheInputOperation.clear();
            cacheInputOperation.add("Negieren");
            display.setText(executeNegation(cacheInputNumber.get(0)));
        });

        Button zero = new Button();
        zero.setText("0");
        GridPane.setRowIndex(zero, 5);
        GridPane.setColumnIndex(zero, 1);
        zero.setPrefHeight(80);
        zero.setPrefWidth(80);
        zero.setOnAction(event ->
        {
            displayString += zero.getText();
            changeDisplayChar("0");
            display.setText(displayString);
            checkNumberRightNow(ergebnisString);
        });

        Button punctuation = new Button();
        punctuation.setText(",");
        GridPane.setRowIndex(punctuation, 5);
        GridPane.setColumnIndex(punctuation, 2);
        punctuation.setPrefHeight(80);
        punctuation.setPrefWidth(80);
        punctuation.setOnAction(event ->
        {
            cacheInputOperation.clear();
            cacheInputOperation.add(",");
        });

        Button equals = new Button();
        equals.setText("=");
        GridPane.setRowIndex(equals, 5);
        GridPane.setColumnIndex(equals, 3);
        equals.setPrefHeight(80);
        equals.setPrefWidth(80);
        equals.setOnAction(event ->
        {

            String eingabe1;
            String eingabe2;



            System.out.println("Erste Zahl im Array: " + cacheInputNumber.get(0));
            System.out.println("Zweite Zahl im Array: " + cacheInputNumber.get(1));

            if(cacheInputOperation.get(0).equals("Quadrat") || cacheInputOperation.get(0).equals("-"))
            {
                executeOperation(cacheInputNumber.get(0), cacheInputOperation.get(0));
            }
            else
            {
                int i = checkHowManyNumbersAvailable();
                switch(i)
                {
                    case 2:
                        executeOperation(cacheInputNumber.get(0), cacheInputNumber.get(1), cacheInputOperation.get(0));
                        System.out.println("Zwei Zahlen eingegeben");
                        break;
                    case 1:
                        if(cacheInputNumber.get(0).contains("-"))
                        {
                            eingabe1 = cacheInputNumber.get(0);
                        }
                        else
                        {
                            eingabe1 = "0";
                        }
                        eingabe2 = cacheInputNumber.get(0);
                        executeOperation(eingabe1, eingabe2, cacheInputOperation.get(0));
                        System.out.println("Eine Zahl eingegeben");
                        break;
                    case 0:
                        eingabe1 = "0";
                        eingabe2 = "0";
                        executeOperation(eingabe1, eingabe2, cacheInputOperation.get(0));
                        System.out.println("Keine Zahl eingegeben");
                        break;
                }
            }
            displayString += " " + equals.getText();
            displayString += " " + cacheResults.get(0);
            display.setText(displayString);
            cacheResults.clear();
            cacheInputOperation.clear();
            cacheInputNumber.clear();
            ergebnisString = "0";
            displayString = "";

        });


        // Hinzufügen des Labels zur unteren Zelle
        gridPane.getChildren().addAll(prozent, wurzel, quadrat, einsdurchx, cleareverything, clear, removeLastChar,
                divide, seven, eight, nine, multiply, four, five, six, minus, one, two, three, plus, negate, zero,
                punctuation, equals);


        vbox.getChildren().addAll(hbox, gridPane);

        // Erstellen Sie eine Szene und fügen Sie die vbox hinzu
        Scene scene = new Scene(vbox, 400, 620);

        // Setzen Sie die Szene auf die Bühne
        primaryStage.setScene(scene);

        // Setzen Sie den Bühnentitel
        primaryStage.setTitle("TASCHENRECHNER BY MATHIAS NITZ");

        // Zeigen Sie die Bühne an
        primaryStage.show();

    }

    public void changeDisplayChar(String eingabe)
    {
        if (ergebnisString.equals("0"))
        {
            ergebnisString = eingabe; // Direkt den eingabe-String zuweisen, wenn ergebnisString "0" ist
        }
        else
        {
            ergebnisString += eingabe;
        }
    }

    public void checkNumberRightNow(String geklickteZahl)
    {
        if(cacheInputNumber.size() == 0)
        {
            cacheInputNumber.add(0, "0");
        }
        else if (cacheInputNumber.size() == 1)
        {
            cacheInputNumber.add(1, geklickteZahl);
        }

        if(cacheInputOperation.size() == 0)
        {
            cacheInputNumber.set(0, geklickteZahl);
            System.out.println(geklickteZahl + " wurde dem Array hinzugefügt.");
            System.out.println("Zahl im Array: " + cacheInputNumber.get(0));
        }
        else
        {
            cacheInputNumber.set(1, geklickteZahl);
            System.out.println("Zweite Zahl im Array: " + cacheInputNumber.get(1));
        }
    }

    public int checkHowManyNumbersAvailable()
    {
        int numbersAvailable = 0;

        System.out.println(cacheInputNumber);

        if(cacheInputNumber.size() == 2)
        {
            numbersAvailable = 2;
        }
        else if (cacheInputNumber.size() < 2)
        {
            numbersAvailable = 1;
        }
        else if (cacheInputNumber.size() == 0)
        {
            numbersAvailable = 0;
        }

        System.out.println("Numbers available: " + numbersAvailable);
        return numbersAvailable;
    }

    public String executeOperation(String eingabe1, String eingabe2, String operation)
    {
        String ergebnis = "0";
        double zahl1 = Double.parseDouble(eingabe1);
        double zahl2 = Double.parseDouble(eingabe2);
        double doubleErgebnis;

        // Checken welcher Operator betätigt wurde

        switch(operation)
        {
            case "Prozent":
                break;
            case "Wurzel":
                doubleErgebnis = Math.sqrt(zahl1);
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case "EinsDurchX":
                break;
            case "RemoveLastChar":
                break;
            case "Division":
                doubleErgebnis = zahl1 / zahl2;
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case "Multiplikation":
                doubleErgebnis = zahl1 * zahl2;
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case "Minus":
                doubleErgebnis = zahl1 - zahl2;
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case "Addition":
                System.out.println("Berechnung Zahl1: " + zahl1);
                System.out.println("Berechnung Zahl2: " + zahl2);
                doubleErgebnis = zahl1 + zahl2;
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case ",":
                break;
        }
        return ergebnis;
    }

    public String executeOperation(String eingabe1, String operation)
    {
        String ergebnis = "0";
        double zahl1 = Double.parseDouble(eingabe1);
        double doubleErgebnis;

        switch(operation)
        {
            case "Quadrat": doubleErgebnis = Math.pow(zahl1, 2);
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
            case "Negieren": doubleErgebnis = -zahl1;
                ergebnis = Double.toString(doubleErgebnis);
                cacheResults.add(ergebnis);
                break;
        }
        return ergebnis;
    }

    public String executeNegation(String eingabe1)
    {
        String ergebnis = "0";

        if(eingabe1.contains("-"))
        {
            cacheInputNumber.clear();
            ergebnis = eingabe1.substring(1);
            cacheInputNumber.add(ergebnis);
        }
        else if(!eingabe1.contains("-"))
        {
            cacheInputNumber.clear();
            StringBuilder builder = new StringBuilder();
            ergebnis = builder.append("-").append(eingabe1).toString();
            cacheInputNumber.add(ergebnis);
        }
        else
        {
            changeDisplayChar(ergebnisString);
            System.out.println("Nichts vorher eingegeben");
        }
        return ergebnis;
    }

    public String clickCounter(String numberClicked)
    {
        int numberClickedInt = Integer.parseInt(numberClicked);
        int clicksCounted = 0;
        clicksCounted++;
        System.out.println(clicksCounted);
        String clicksCountedString = Integer.toString(clicksCounted);
        System.out.println(clicksCountedString.repeat(clicksCounted));
        return clicksCountedString.repeat(clicksCounted);
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    public static String ergebnisString = "0";
    public static String displayString = "";
    public static ArrayList<String> cacheInputNumber = new ArrayList<>(2);
    public static ArrayList<String> cacheInputOperation = new ArrayList<>();
    public static ArrayList<String> cacheResults = new ArrayList<>();

}
