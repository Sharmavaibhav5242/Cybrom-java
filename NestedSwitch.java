import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter choice of ordering");
        System.out.println("fruits or veg");
        String choice;
        int vege;
        String option;
        choice = obj.nextLine();

        switch (choice) {
            case "veg": {
                System.out.println("1.Mushroom 2.Paneer 3.Bhindi");
                vege = obj.nextInt();
                obj.nextLine();
                switch (vege) {
                    case 1: {
                        System.out.println("a.Mushroom soup b.Mushroom pizza");
                        option = obj.nextLine();
                        switch (option) {
                            case "a": {
                                System.out.println("Mushroom soup ordered");
                            }
                            break;
                            case "b": {
                                System.out.println("Mushroom pizza ordered");
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("a.Paneer tikka masala b.kadhai paneer");
                        option = obj.nextLine();
                        switch (option) {
                            case "a": {
                                System.out.println("Paneer tikka masala ordered");
                            }
                            break;
                            case "b": {
                                System.out.println("Kadhai paneer ordered");
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        System.out.println("Bhindi not available");
                    }
                    break;
                }
            }
            break;
            case "fruits": {
                System.out.println("1.Mango 2.Pomegranate 3.Banana");
                vege = obj.nextInt();
                obj.nextLine();
                switch (vege) {
                    case 1: {
                        System.out.println("a.Mango Shake b.Mango ice-cream");
                        option = obj.nextLine();
                        switch (option) {
                            case "a": {
                                System.out.println("Mango Shake ordered");
                            }
                            break;
                            case "b": {
                                System.out.println("Mango ice-cream ordered");
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("a.Pomegranate juice b.Pomegranate dish");
                        option = obj.nextLine();
                        switch (option) {
                            case "a": {
                                System.out.println("Pomegranate juice ordered");
                            }
                            break;
                            case "b": {
                                System.out.println("Pomegranate dish ordered");
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        System.out.println("Banana not available");
                    }
                    break;
                }
            }
            break;
            default:
                System.out.println("Invalid order");
        }
    }
}
