import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * This class creates a square matrix based on user input, fills
 it with a
 * specified character, and outputs the matrix to both the
 console and a file.
 */
public class Lab1TymkivKI306 {
    /**
     * The main method creates a square matrix with a userdefined size, fills it with
     * a specified character, and prints the matrix to the
     * console and a file.
     *
     * @param args Command-line arguments (not used).
     * @throws FileNotFoundException if the output file cannot
     *                               be created.
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        arr = new char[nRows][];
        for (int i = 0; i < nRows / 2; i++) {
            arr[i] = new char[nRows / 2];
        }
        for (int i = nRows / 2; i < nRows; i++) {
            arr[i] = new char[nRows];
        }
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        exit:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (filler.length() == 1) {
                    if (i < nRows / 2) {
                        if (j < nRows / 2) {
                            arr[i][j] = (char)
                                    filler.codePointAt(0);
                        }
                    } else {
                        if (j < nRows / 2) {
                            arr[i][j] = ' ';
                        } else {
                            arr[i][j] = (char)
                                    filler.codePointAt(0);
                        }
                    }
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}