public class StockTestsMain {
    public static void main(String[] args) {
        Product[] arrayProducts = new Product[14];

        Date myDate = new Date(14, 12, 2021);
        Date myDate1 = new Date(1, 1, 2022);
        Date myDate2 = new Date(30, 5, 2022);

        arrayProducts[0] = new Perishable("Alho", "Fruteira", 2.19, myDate, 32);
        arrayProducts[1] = new Perishable("Cenoura", "Fruteira", 1, myDate2, 90);
        arrayProducts[2] = new Perishable("Frango", "Açougue", 19.99, myDate, 65);
        arrayProducts[3] = new Perishable("Pão", "Padaria", 6.19, myDate1, 12);
        arrayProducts[4] = new Perishable("Cerveja", "Bebidas", 9.19, myDate, 45);
        arrayProducts[5] = new Perishable("Jaca", "Fruteira", 9.80, myDate2, 13);
        arrayProducts[6] = new Perishable("Queijo", "Laticínios", 22.19, myDate, 78);
        arrayProducts[7] = new NonPerishable("Café", "Matinais", 10.99, 20);
        arrayProducts[8] = new NonPerishable("Toalha", "Cama/Mesa/Banho", 20.15, 30);
        arrayProducts[9] = new NonPerishable("Filtro de café", "Matinais", 4.99, 60);
        arrayProducts[10] = new NonPerishable("Cola", "Papelaria", 5, 10);
        arrayProducts[11] = new NonPerishable("Caneta", "Papelaria", 10.99, 54);
        arrayProducts[12] = new NonPerishable("Pilhas", "Eletrônicos", 3.57, 9);
        arrayProducts[13] = new NonPerishable("Cadeira de praia", "Mobília", 20.99, 80);

        Stock stock = new Stock(arrayProducts);
        String auxString;

        System.out.println("----------print original array----------");
        auxString = stock.toString(arrayProducts);
        System.out.println(auxString);
        System.out.println();

        System.out.println("----------listing perishable items----------");
        Perishable[] arrayPerishable;
        arrayPerishable = stock.listingPerishables(arrayProducts);
        auxString = stock.toString(arrayPerishable);
        System.out.println(auxString);
        System.out.println();

        System.out.println("----------listing products sorted by price traditional way----------");
        stock.sortProductsByPrice(arrayProducts);

        System.out.println("----------listing products sorted by price----------");
        stock.pricesCompare(arrayProducts);

        System.out.println("----------listing products sorted by amount----------");
        stock.amountCompare(arrayProducts);

        System.out.println("----------print final array----------");
        auxString = stock.toString(arrayProducts);
        System.out.println(auxString);
    }
}