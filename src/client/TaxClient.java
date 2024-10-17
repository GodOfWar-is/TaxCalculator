package client;

import client.TaxCalculatorService;
import client.TaxCalculator;

import java.util.Scanner;

public class TaxClient {
    public static void main(String[] args) {
        // 创建服务和端口
        TaxCalculatorService service = new TaxCalculatorService();
        TaxCalculator calculator = service.getTaxCalculatorPort();

        // 用户输入交互
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your income:");
        double income = scanner.nextDouble();

        // 调用Web服务进行税务计算
        double tax = calculator.calculateTax(income);
        System.out.println("Your tax is:" + tax);
    }
}
