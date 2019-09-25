public class Desserts extends MenuItem {
    private int select;
    private int amount;

    Desserts[] menu = new Desserts[2];

    public Desserts() {
    }

    public Desserts(int select, int amount) {
        listOfItems();
        this.select = select;
        this.amount = amount;
    }
    public Desserts(String name, String description, double price) {
        super(name, description, price);
    }

    public void Initialization() {
        BufferLines("List Of Desserts",        "|Name" ,"|Description","|Price   |"
        );
        listOfItems();
        ItemsPrints();
        PriceDesign();

        for (int i = 0; i < menu.length; i++) {
            System.out.format("|" + "%3.3s", (i + 20) + ".");
            System.out.format("%18.27s %23.25s", menu[i].ItemsPrints(), menu[i].description);
            //System.out.format( "%40.20s", drinksMenu[i].description);
            System.out.format("%38.6s", menu[i].PriceDesign());
            System.out.format(" |\n");
        }
        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
        System.out.println();
    }


    public void listOfItems() {
        menu[0] = new Desserts("Strawberry Chocolate Cake", "chocolate ,strawberry!", 5.99);
        menu[1] = new Desserts("Ultimate Gooey Brownies", "milk and chocolate in middle!", 4.99);
    }

    public void Ordername() {

        BufferLines("Bill","|Name" ,"|Amount","|Total   |");
        System.out.format("|" + "%3.3s",   " ");
        System.out.format("%20.30s %25.20s", menu[select - 20].name, amount);
        System.out.format("%42.25s", amount * menu[select - 20].price+"€");
        System.out.format(" |\n");
        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
    }
}