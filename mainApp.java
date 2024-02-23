

 import java.util.*;
 import java.time.*;
 import java.text.SimpleDateFormat;
 import java.util.concurrent.TimeUnit;

public class mainApp{
    public static void main(String[] args) throws Exception{

        CreateFileApp ap = new CreateFileApp();
        ap.CreateList();
        ap.CreateFile();
        ap.load_sales("sales.txt");
        ap.load_orders("orders.txt");
        
        for(;;){

            boolean correct =false;

            System.out.println("1.Overview of all available devices");
            System.out.println("2.Overview of all orders");
            System.out.println("3.Overview of all sales");
            System.out.println("4.Exit");

            Scanner sc=new Scanner(System.in);

            System.out.print("\nChoose one of the options above:");
            int choice=sc.nextInt();
            
            if(choice==1){
                for(;;){
                    System.out.println("\n1.Sound and Picture");
                    System.out.println("2.Gaming");
                    System.out.println("3.Home Devices");
                    System.out.println("4.Back");

                    System.out.println("Choose category:");
                    int category=sc.nextInt();

                    if(category==1){
                        for(;;){
                            System.out.println("\n1.Tv");
                            System.out.println("2.Blue Ray and DVD");
                            System.out.println("3.Camera");
                            System.out.println("4.Back");

                            System.out.println("Choose product:");
                            int Products1=sc.nextInt();

                            if(Products1==1){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(0).getModel());
                                    System.out.println("2."+ ap.get(1).getModel());
                                    System.out.println("3.Back");

                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();

                                    if(OptionModel==1){
                                        ap.BuyOrder(0);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(1);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }

                                }
                            }else if(Products1==2){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(2).getModel());
                                    System.out.println("2."+ ap.get(3).getModel());
                                    System.out.println("3.Back");

                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();

                                    if(OptionModel==1){
                                        ap.BuyOrder(2);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(3);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }
                                }
                            }else if(Products1==3){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(4).getModel());
                                    System.out.println("2."+ ap.get(5).getModel());
                                    System.out.println("3.Back");
                                    
                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();

                                    if(OptionModel==1){
                                        ap.BuyOrder(4);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(5);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }
                                }
                            }else if(Products1==4){
                                break;
                            }else{
                                System.out.println("Wrong number");
                            }
                            if(correct==true){
                                break;
                            }
                        }
                    }else if(category==2){
                        for(;;){
                            System.out.println("\n1.Consoles");
                            System.out.println("2.Back");

                            System.out.println("Choose product:");
                            int Products1=sc.nextInt();

                            if(Products1==1){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(6).getModel());
                                    System.out.println("2."+ ap.get(7).getModel());
                                    System.out.println("3.Back");

                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();
                                    if(OptionModel==1){
                                        ap.BuyOrder(6);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(7);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }
                                }
                            }else if(Products1==2){
                                break;
                            }else{
                                System.out.println("Wrong number");
                            }
                            if(correct==true){
                                break;
                            }
                        }
                    }else if(category==3){
                        for(;;){
                            System.out.println("\n1.Fridge");
                            System.out.println("2.Washing Machine");
                            System.out.println("3.Back");

                            System.out.println("Choose product:");
                            int Products1=sc.nextInt();

                            if(Products1==1){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(8).getModel());
                                    System.out.println("2."+ ap.get(9).getModel());
                                    System.out.println("3.Back");

                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();

                                    if(OptionModel==1){
                                        ap.BuyOrder(8);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(9);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }

                                }
                            }else if(Products1==2){
                                for(;;){
                                    System.out.println("\n1."+ ap.get(10).getModel());
                                    System.out.println("2."+ ap.get(11).getModel());
                                    System.out.println("3.Back");

                                    System.out.println("Choose model:");
                                    int OptionModel=sc.nextInt();

                                    if(OptionModel==1){
                                        ap.BuyOrder(10);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==2){
                                        ap.BuyOrder(11);
                                        correct=true;
                                        break;
                                    }else if(OptionModel==3){
                                        break;
                                    }else{
                                        System.out.println("Wrong number");
                                    }

                                }

                            }else if(Products1==2){
                                break;
                            }else{
                                System.out.println("Wrong number");
                            }
                            if(correct==true){
                                break;
                            }
                        }
                    }else if(category==4){
                        break;
                    }else{
                        System.out.println("Wrong number");
                    }
                    if(correct==true){
                        break;
                    }
                }
            }else if(choice==2){
                ap.DisplayOrders();
            }else if(choice==3){
                ap.DisplaySales();
            }else if(choice==4){
                ap.UpdateFile_orders();
                ap.UpdateFile_sales();
                break;
            }else{
                System.out.println("Wrong number");
            }
        }

        
    }
}