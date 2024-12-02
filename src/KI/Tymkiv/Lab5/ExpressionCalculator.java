package KI.Tymkiv.Lab5;

import java.io.*;

public class ExpressionCalculator {
    public double calculate(double x) throws ArithmeticException
    {
        double cosValue = Math.cos(4 * x);
        if (cosValue == 0) {
            throw new ArithmeticException("Ділення на нуль: cos(4 * " + x + ") = 0");
        }
        return 1.0 / cosValue;
    }
    /**
     * Записує результат обчислення у текстовий файл.
     *
     * @param result результат обчислення
     * @param filePath шлях до файлу
     * @throws IOException якщо виникає помилка при записі у
    файл
     */
    public void writeResultToFile(double result, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Результат обчислення: " + result);
        }
    }
    /**
     * Записує результат обчислення у двійковий файл.
     *
     * @param result результат обчислення
     * @param filePath шлях до двійкового файлу
     * @throws IOException якщо виникає помилка при записі у
    файл
     */
    public void writeResultToBinaryFile(double result, String filePath) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeDouble(result);
        }
    }
    /**
     * Читає результат з текстового файлу.
     *
     * @param filePath шлях до файлу
     * @return результат обчислення, зчитаний з файлу
     * @throws IOException якщо виникає помилка при читанні
    файлу
     */
    public double readResultFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new
                FileReader(filePath))) {
            String line = reader.readLine();
            return Double.parseDouble(line.replaceAll("[^\\d.-]", ""));
        }
    }
    /**
     * Читає результат з двійкового файлу.
     *
     * @param filePath шлях до двійкового файлу
     * @return результат обчислення, зчитаний з файлу
     * @throws IOException якщо виникає помилка при читанні
    файлу
     */
    public double readResultFromBinaryFile(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            return dis.readDouble();
        }
    }
}