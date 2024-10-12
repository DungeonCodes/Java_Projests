import java.util.Scanner;//Biblioteca para leitura de interface humana-teclado

public class Converter {

    // Método para converter Celsius para Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        // Converte para Fahrenheit e exibe o resultado
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        // Solicita a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        // Converte para Celsius e exibe o resultado
        celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Temperatura em Celsius: " + celsius);

        scanner.close();
    }
}
