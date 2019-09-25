public class Drinks extends MenuItem {
    MenuItem item = new MenuItem();
    Drinks[] drinksMenu = new Drinks[a];
    private int select;
    private int amount;

    public Drinks() {

    }
    public Drinks(int select, int amount) {
        listOfItems();
        this.select = select;
        this.amount = amount;
    }
    public Drinks(String name, String description, double price) {
        super(name, description, price);
    }
    public void DrinksInit() {
        item.BufferLines("List of Drinks",        "|Name" ,"|Description","|Price   |"
        );
        listOfItems();
        ItemsPrints();
        PriceDesign();
        for (int i = 0; i < drinksMenu.length; i++) {
            System.out.format("|" + "%3.3s", (i + 6) + ".");
            System.out.format("%20.30s %25.20s", drinksMenu[i].ItemsPrints(), drinksMenu[i].description);
            //System.out.format( "%40.20s", drinksMenu[i].description);
            System.out.format("%42.25s", drinksMenu[i].PriceDesign());
            System.out.format(" |\n");
        }
    }


    public void listOfItems() {
        drinksMenu[0] = new Drinks("Still water", "das Mineralwasser", 0.99);
        drinksMenu[1] = new Drinks("Sparkling water – ", "das Sprudelwasser.", 1.25);
        drinksMenu[2] = new Drinks("TAP WATER. ", " das Leitungswasser.", 0.90);
        drinksMenu[3] = new Drinks("Tea ", " der Tee", 1.60);
        drinksMenu[4] = new Drinks("Herbal Tea ", " der Kräutertee", 1.90);
        drinksMenu[5] = new Drinks("Coffee ", " der Kaffee", 2.5);
        drinksMenu[6] = new Drinks("Milk ", " die Milch", 3.25);
        drinksMenu[7] = new Drinks("Fruit juice ", " der Fruchtsaft", 4.25);
        drinksMenu[8] = new Drinks("Orange juice ", " der Orangensaft", 2.60);
        drinksMenu[9] = new Drinks("Apple juice ", " der Apfelsaft", 1.96);
        drinksMenu[10] = new Drinks("Coca cola ", " die Cola", 1.50);
        drinksMenu[11] = new Drinks("Smoothie ", " das Milchmixgetränk", 3.50);
        drinksMenu[12] = new Drinks("Iced tea ", " der Eistee", 2.46);
        drinksMenu[13] = new Drinks("Iced coffee ", " der Eiskaffee", 2.70);
    }
    public void Ordername() {


        BufferLines("Bill","|Name" ,"|Amount","|Total   |");
        System.out.format("|" + "%3.3s",   " ");
        System.out.format("%20.30s %25.20s", drinksMenu[select - 6].name, amount);
        System.out.format("%42.25s", amount * drinksMenu[select - 6].price+"€");
        System.out.format(" |\n");
        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
    }
}





