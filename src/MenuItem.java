
public class MenuItem {
    String name;
    String description;
    double price;
    int a = 14;//arraylenght in Drinks

    public MenuItem() {
        //* Default Constructor */
    }
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String ItemsPrints() {

        String temp;
        temp = this.name + " ";
        return temp;
    }
    public String PriceDesign() {
        String priceOnly;
        priceOnly = this.price + "€";
        return priceOnly;
    }
    public String DescriptionDesign() {
        String descriptionOnly;
        descriptionOnly = this.description + " ";
        return descriptionOnly;
    }
    public void BufferLines(String nameOffish,String name0, String Description0, String Price0) {
        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.format("| " + "%" + 50 + "s", nameOffish);

        System.out.format("%" + (94 - 52) + "s", "|");
        System.out.println();
        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.format(name0 + "%" + 45 + "s", Description0);
        System.out.format("%" + 44 + "s",Price0 );
        System.out.println();

        for (int a = 0; a < 94; a++) {
            System.out.print("-");
        }
        System.out.println();


    }

    public void Ordername() {

    }
}