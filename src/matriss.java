import java.util.Scanner;

public class matriss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // Matrisi oluştur ve kullanıcıdan değerleri al
        int[][] matrix = new int[rows][cols];

        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpozunu bulmak için yeni bir dizi oluştur
        int[][] transposeMatrix = new int[cols][rows];

        // Matrisi döngü kullanarak okuyun ve transpozisini yeni diziye aktarın
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisini yazdır
        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}