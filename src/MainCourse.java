public class MainCourse extends MenuItem {

        MenuItem item = new MenuItem();
    MainCourse [] mainCourse = new MainCourse[5];
        private int select;
        private int amount;


        public MainCourse(int select, int amount) {
            listOfItems();
            this.select=select;
            this.amount=amount;

        }

        public MainCourse() {

        }

        public MainCourse(String name, String description, double price) {
            super(name, description, price);

        }


        public void MainCourseDisplay() {

            item.BufferLines("List of MainCourse",        "|Name" ,"|Description","|Price   |"
            );
            listOfItems();
            ItemsPrints();
            PriceDesign();
            for (int i = 0; i < mainCourse.length; i++) {
                System.out.format("|" + "%3.3s", (i + 1) + ".");
                System.out.format("%20.30s %25.20s", mainCourse[i].ItemsPrints(), mainCourse[i].description);
                //System.out.format( "%40.20s", drinksMenu[i].description);
                System.out.format("%42.25s", mainCourse[i].PriceDesign());
                System.out.format(" |\n");

            }

        }


        public void listOfItems() {
            mainCourse[0] = new MainCourse("Rinderroulade", "Beef Roll", 7.99);
            mainCourse[1] = new MainCourse("Hasenpfeffer ", "Rabbit Stew.", 12.25);
            mainCourse[2] = new MainCourse(" Kartoffelkloesse", " Potato Dumplings.", 8.90);
            mainCourse[3] = new MainCourse("Spätzle", " Egg Noodles", 7.60);
            mainCourse[4] = new MainCourse("Butterkäse ", " Butter Cheese", 6.90);

        }
        public void Ordername(){
//            System.out.println(mainCourse[select - 1].name + "  " + mainCourse[select - 1].price);
//            System.out.println("Your final Bill is : " + amount * mainCourse[select - 1].price);
//
            BufferLines("Bill","|Name" ,"|Amount","|Total   |");
                System.out.format("|" + "%3.3s",   " ");
                System.out.format("%20.30s %25.20s", mainCourse[select-1].name, amount);
                System.out.format("%42.25s", amount * mainCourse[select - 1].price+"€");
                System.out.format(" |\n");
            for (int a = 0; a < 94; a++) {
                System.out.print("-");
            }

        }
    }


