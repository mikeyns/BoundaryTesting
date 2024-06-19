public class BoundaryTesting {
    public static void main(String[] args) {
        // Valores de teste limite do ano e mês
        int[][] testValues = {
            {1582, 2},
            {1583, 0},
            {1583, 13},
            {1583, 1},
            {1583, 12}
        };

        // Iterar sobre os valores de teste
        for (int i = 0; i < testValues.length; i++) {
            int year = testValues[i][0];
            int month = testValues[i][1];
            System.out.println("Validando entrada para o ano " + year + " e mes " + month);
            validateInput(year, month);
        }
    }

    public static void validateInput(int year, int month) {
        if (year < 1582) {
            System.out.println("Ano invalido. O ano deve ser igual ou maior que 1582.");
        } else if (month < 1 || month > 12) {
            System.out.println("Mes invalido. O mes deve estar entre 1 e 12.");
        } else {
            System.out.println("Entrada valida.");
        }
    }
}