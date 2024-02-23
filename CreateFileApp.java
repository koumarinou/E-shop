import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

class CreateFileApp{

    public ArrayList <Product> products = new ArrayList<Product>();
    public ArrayList <Order> orders = new ArrayList <Order>();
    public ArrayList <Buy> sales = new ArrayList <Buy>();

    public void CreateList() throws Exception{

        System.out.println("\nCreating list");
        TimeUnit.SECONDS.sleep(1);
    
        products.add(new Tv(12654, "UE55CU7172UXXH", 2023, "SUMSUNG", 599.99, 100, "LED", 55.0, "HDMI", "4K"));
        products.add(new Tv(23457, "UN3232LE", 2020, "SONY", 450.0, 40, "LCD", 32.0, "HDMI", "3K"));
        products.add(new DVD(36781, "TAEP200", 2017, "PHILIPS", 44.90, 10, "DVD", "4K", "DVD-RW"));
        products.add(new DVD(48764, "S500EG", 2015, "PANASONIC", 20.0, 1, "DVD", "3K", "DVD+RW"));
        products.add(new Camera(87563, "ETSQ12", 2010, "SONY", 14.50, 200, "ACTION", "13MP", "YES", "NO", 2.0));
        products.add(new Camera(54590, "AKT678", 2009, "GOPRO", 20.0, 3, "COMPACT", "20MP", "YES", "YES", 6.0));
        products.add(new Console(34541, "KAP300", 2020, "SONY", 499.99, 0, "PS5", "8xZen2", "4K", 4, "DOLBY"));
        products.add(new Console(90876, "TAB245", 2010, "SONY", 199.99, 5, "PS4", "8xZen1", "3K", 12, "DOLBY"));
        products.add(new Fridge(68763, "WER45G", 2023, "LG", 1599.99, 3, "CLOSET", "A", 416, 219));
        products.add(new Fridge(70651, "BOK048", 2019, "SONY", 1000.99, 3, "CLOSET", "B", 345, 167));
        products.add(new WashingMachine(28630, "LAP789", 2021, "LG", 499.0, 1, "B", 9, 1400));
        products.add(new WashingMachine(58782, "VAB678", 2016, "LG", 200.50, 30, "C", 6, 1000));
    }

    public void CreateFile() throws Exception{
        FileWriter writer = null;
        System.out.println("\nWriting File");
        TimeUnit.SECONDS.sleep(1);

        try {
            writer = new FileWriter(new File("available_products.txt"));

            for (Product i:products){

                if (i instanceof Tv) {
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE TV" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "TV_TYPE " + ((Tv)i).getType()
                                    + "\n" + "\t" + "INCHES " + ((Tv)i).getInches()
                                    + "\n" + "\t" + "CONNECT " + ((Tv)i).getConnect()
                                    + "\n" + "\t" + "PIXEL " + ((Tv)i).getPixel()
                                    + "\n" + "}" + "\n");
                }
                else if (i instanceof DVD){
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE DVD" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "DVD_TYPE " + ((DVD)i).getType()
                                    + "\n" + "\t" + "PIXEL " + ((DVD)i).getPixel()
                                    + "\n" + "\t" + "FORMAT " + ((DVD)i).getFormat()
                                    + "\n" + "}" + "\n");
                }
                else if (i instanceof Camera){
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE DVD" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "TYPE " + ((Camera)i).getType()
                                    + "\n" + "\t" + "MEGAPIXEL " + ((Camera)i).getMegapixel()
                                    + "\n" + "\t" + "OPTICALZOOM " + ((Camera)i).getOpticalZoom()
                                    + "\n" + "\t" + "DIGITALLZOOM " + ((Camera)i).getDigitalZoom()
                                    + "\n" + "\t" + "INCHES " + ((Camera)i).getInches()
                                    + "\n" + "}" + "\n");
                }
                else if (i instanceof Console){
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE CONSOLE" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "TYPE " + ((Console)i).getType()
                                    + "\n" + "\t" + "PROCESSOR " + ((Console)i).getProcessor()
                                    + "\n" + "\t" + "GRAPHIC " + ((Console)i).getGraphic()
                                    + "\n" + "\t" + "HARDDRIVE " + ((Console)i).getHardDrive()
                                    + "\n" + "\t" + "AUDIO " + ((Console)i).getAudio()
                                    + "\n" + "}" + "\n");
                }
                else if (i instanceof Fridge){
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE FRIDGE" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "TYPE " + ((Fridge)i).getType()
                                    + "\n" + "\t" + "ENERGCLASS " + ((Fridge)i).getEnergClass()
                                    + "\n" + "\t" + "CAPACITYFRIDGE " + ((Fridge)i).getCapacityFridge()
                                    + "\n" + "\t" + "CAPACITYREFRI " + ((Fridge)i).getCapacityReFRi()
                                    + "\n" + "}" + "\n");
                }
                else if (i instanceof WashingMachine){
                    writer.write ("ITEM" + "\n" + "{" 
                                    + "\n" + "\t" + "ITEM_TYPE WASHINGMACHINE" 
                                    + "\n" + "\t" + "CODE " + i.getCode()
                                    + "\n" + "\t" + "MODEL " + i.getModel()
                                    + "\n" + "\t" + "YEAR " + i.getYear()
                                    + "\n" + "\t" + "CONSTUCTOR " + i.getConstructor()
                                    + "\n" + "\t" + "PRICE " + i.getPrice()
                                    + "\n" + "\t" + "QUANTITY " + i.getQuantity()
                                    + "\n" + "\t" + "ENERGCLASS " + ((WashingMachine)i).getEnergClass()
                                    + "\n" + "\t" + "CAPACITY " + ((WashingMachine)i).getCapacity()
                                    + "\n" + "\t" + "TURNS " + ((WashingMachine)i).getTurns()
                                    + "\n" + "}" + "\n");
                }
                
            }
            writer.close();
        }
        catch (IOException e){
            System.err.println("\nError writing file ");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void UpdateFile_sales() throws Exception{
        if (sales != null){

            FileWriter sales_writer = null;
            System.out.println("\nUpdating sales");
            TimeUnit.SECONDS.sleep(1);

            try{
                sales_writer = new FileWriter(new File("sales.txt"));
                for (Buy i:sales){
                    sales_writer.write ("Buy#" + i.getSaleCode() + "#" + i.getModel() + "#" + i.getName() + "#" + i.getPhoneNumber() + "#" + i.getDate() + "#" + i.getPrice() + "\n");
                }
                sales_writer.close();
            }
            catch (IOException e){
                System.err.println("\nError writing file");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }

    public void UpdateFile_orders() throws Exception{
        if (orders != null){
            FileWriter order_writer = null;
            System.out.println("\nUpdating orders");
            TimeUnit.SECONDS.sleep(1);
            try{
                order_writer = new FileWriter(new File("orders.txt"));
                for (Order i:orders){
                    order_writer.write ("Order#" + i.getSaleCode() + "#" + i.getModel() + "#" + i.getName()+ "#" + i.getPhoneNumber() + "#" + i.getDate() + "#" + i.getPrice() + "#" + i.getStatus() + "\n");
                }
                order_writer.close();
            }
            catch (IOException e){
                System.err.println("\nError writing file");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }

    void load_sales(String data) throws Exception{

        System.out.println("\nLoading sales");
        TimeUnit.SECONDS.sleep(1);

        BufferedReader reader = null;
        Buy p = null;

        try{
            reader = new BufferedReader (new FileReader(data));
            String line = reader.readLine();

            while (line != null){

                StringTokenizer f = new StringTokenizer(line, "#");
                String token = f.nextToken();

                p = new Buy();
                p.setSaleCode(Integer.parseInt(f.nextToken()));
                p.setModel(f.nextToken());
                p.setName(f.nextToken());
                p.setPhoneNumber(new BigInteger(f.nextToken()));
                p.setDate(LocalDate.parse(f.nextToken()));
                p.setPrice(Double.parseDouble(f.nextToken()));

                sales.add (p);
                line = reader.readLine();
            }
        }
        catch (IOException e){
                System.err.println("\nError writing file");
                TimeUnit.SECONDS.sleep(1);
        }
    }

    void load_orders(String data) throws Exception{

        System.out.println("\nLoading orders");
        TimeUnit.SECONDS.sleep(1);

        BufferedReader reader = null;
        Order p = null;

        try{
            reader = new BufferedReader (new FileReader(data));
            String line = reader.readLine();

            while (line != null){

                StringTokenizer f = new StringTokenizer(line, "#");
                String token = f.nextToken();

                p = new Order();
                p.setSaleCode(Integer.parseInt(f.nextToken()));
                p.setModel(f.nextToken());
                p.setName(f.nextToken());
                p.setPhoneNumber(new BigInteger(f.nextToken()));
                p.setDate(LocalDate.parse(f.nextToken()));
                p.setPrice(Double.parseDouble(f.nextToken()));
                p.setStatus(f.nextToken());

                orders.add (p);
                line = reader.readLine();
            }
        }
        catch (IOException e){
                System.err.println("\nError writing file");
                TimeUnit.SECONDS.sleep(1);
        }
    }

    Product get(int i){
        return products.get(i);
    }

    Product BuyOrder(int x) throws Exception{

        for (;;){
            System.out.println(products.get(x).toString());

            products.get(x).discount();

            if (products.get(x).getQuantity() > 0){
                for (;;){
                    System.out.println("\n1. Buy");
                    System.out.println("\n2. Back");

                    Scanner sc = new Scanner(System.in);
                    int option = sc.nextInt();
                    
                    if (option == 1){

                        products.get(x).discount();
                        System.out.println("\nGive name");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.println("\nGive phone number");
                        
                        BigInteger phoneNumber = sc.nextBigInteger();

                        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                        LocalDate localDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        
                        sales.add(new Buy(sales.size() + 1, products.get(x).getModel(),name, phoneNumber, localDate, products.get(x).getPrice()));
                        
                        break;
                    }
                    else if (option == 2){
                        break;
                    }
                    else{
                        System.out.println("\nWrong number");
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                break;
            }
            else{
                for (;;){
                    System.out.println("\n1. Order");
                    System.out.println("\n2. Back");

                    Scanner sc = new Scanner(System.in);
                    int option2 = sc.nextInt();

                    if (option2 == 1){

                        products.get(x).discount();
                        System.out.println("\nGive name");
                        sc.nextLine();
                        String name2 = sc.nextLine();

                        System.out.println("\nGive phone number");
                        
                        BigInteger phoneNumber2 = sc.nextBigInteger();

                        String today2 = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                        LocalDate localDate2 = LocalDate.parse(today2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        
                        for(;;){
                            System.out.println("\nGive arrival date: ");

                            sc.nextLine();
                            String arrival1=sc.nextLine();
                            LocalDate arrival= LocalDate.parse(arrival1, null);

                            int dc = arrival.compareTo(localDate2);
                            if (dc >= 0){
                                
                                orders.add(new Order(orders.size() + 1, products.get(x).getModel(), name2, phoneNumber2, localDate2, products.get(x).getPrice(), "In transit"));
                                break;
                            }
                            else{
                                System.out.println("\nWrong date, give another one");
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        break;
                    }
                    else if (option2 == 2){
                        break;
                    }
                    else{
                        System.out.println("\nWrong number");
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                break;
            }
        }
        return null;
    }

    Product DisplayOrders() throws Exception{
        if ("orders.txt" != null){
            for(int i = 0; i <= orders.size() - 1; i++){
                System.out.println("\n" + (i + 1) + ". " + orders.get(i));
            }
            
            System.out.println("\nSelect an order");

            Scanner sc = new Scanner(System.in);
            int optionOfOrder = sc.nextInt();

            for(int i = 0; i <= orders.size() - 1; i++){
                if (optionOfOrder == i + 1){
                    System.out.println("\n1. Order arrival and sale");
                    System.out.println("\n2. Back");

                    
                    int option3 = sc.nextInt();

                    for(;;){
                        if (option3 == 1){
                            if (orders.get(i).getStatus() == "In transit"){
                                Buy a = new Buy(sales.size() + 1, orders.get(i).getModel(), orders.get(i).getName(), orders.get(i).getPhoneNumber(), orders.get(i).getDate(), orders.get(i).getPrice());
                                sales.add(a);
                                orders.get(i).setStatus(("Delivered"));
                                break;
                            }
                            else{
                                System.out.println("Order has been delivered");
                                TimeUnit.SECONDS.sleep(1);
                            }
                        }
                        else if(option3 == 2){
                            break;
                        }
                        else{
                            System.out.println("\nWrong number");
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    break;
                }
                else if (optionOfOrder > orders.size()){
                    System.out.println("\nWrong number");
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        }
        else{
            System.out.println("There are no orders yet");
            TimeUnit.SECONDS.sleep(1);
        }
        return null;
    }

    Product DisplaySales() throws Exception{
        if ("sales.txt" != null){
            for(int i = 0; i <= sales.size() - 1; i++){
                System.out.println(sales.get(i) + "\n");
            }
        }
        else{
            System.out.println("There are no sales yet");
            TimeUnit.SECONDS.sleep(1);
        }
        return null;
    }
}