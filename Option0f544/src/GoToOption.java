import java.util.Scanner;
public class GoToOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //home menu
        System.out.println("Select an option:");
        System.out.println("1: Sh 20= 1GB, 1hr");
        System.out.println("2: Sh 10= 1GB Youtube, 3hrs");
        System.out.println("3: BLAZE Deals");
        System.out.println("4: DAILY");
        System.out.println("5: WEEKLY");

        int outerChoice = scanner.nextInt();

       ///sub meu of option1 Sh 20= 1GB, 1hr
        switch (outerChoice) {
            case 1:
                System.out.println("Confirm purchase of Sh 20= 1GB, 1hr");
                System.out.println("Pay with: ");
                System.out.println("1: Airtime");
                System.out.println("2: M-Pesa");
                System.out.println("3: BACK  4: HOME");


                break;
            ///sub meu of option2 Sh 10= 1GB Youtube, 3hrs
            case 2:
                System.out.println("Confirm purchase of Sh 10= 1GB Youtube, 3hrs");
                System.out.println("Pay with: ");
                System.out.println("1: Airtime");
                System.out.println("2: M-Pesa");
                System.out.println("3: BACK  4: HOME");
                break;
            ///sub meu of option3 BLAZE Deals
            case 3:

                System.out.println("Select a sub-option:");
                System.out.println("1: Sh100=2GB 24hrs+ FREE Google Maps");
                System.out.println("2: Sh50=1.5GB 3hrs");
                System.out.println("3: Sh7=150MB 24hr");
                System.out.println("4: Sh250=2GB 30Days");
                System.out.println("5: Sh500=5GB 30Days");
                System.out.println("6: Sh500=750MB 30Days(250MB/Day).");

                int innerChoice = scanner.nextInt();
                switch (innerChoice) {
                    case 1:
                        System.out.println("Confirm purchase of Sh100=2GB+Free Google Maps valid 24hrs");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK");
                        break;
                    case 2:
                        System.out.println("Confirm purchase of Sh20=1GB 1hr");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 3:
                        System.out.println("Confirm purchase of Sh7=150MB 24hr");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 4:
                        System.out.println("Confirm purchase of Sh250=2GB 30Days");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 5:
                        System.out.println("Confirm purchase of Sh500=5GB 30Days");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 6:
                        System.out.println("Confirm purchase of Sh500=750MB 30Days(250MB/Day)");
                        System.out.println("Pay with: ");
                        System.out.println("1: Airtime");
                        System.out.println("2: M-Pesa");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    default:
                        System.out.println("Invalid sub-option.");
                        break;
                }
                break;
            ///sub meu of option4 DAILY
            case 4:
                System.out.println("Select an option:");
                System.out.println("1: Sh5=15MB+10SMS");
                System.out.println("2: Sh10=50MB+25SMS");
                System.out.println("3: Sh20=150MB+70SMS+WhatsApp");
                System.out.println("4: Sh50=500MB+200SMS+WhatsApp");
                System.out.println("5: Sh100:1BG+200SMS+WatsApp");
                System.out.println("6: Power Hour 250MB@Sh19");
                System.out.println("7: HOME");

                int innerChoiceI = scanner.nextInt();
                switch (innerChoiceI) {
                    case 1:
                        System.out.println("1: Buy Once");
                        System.out.println("2: Auto Renew");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 2:
                        System.out.println("1:Buy Once");
                        System.out.println("2:Auto Renew");
                        System.out.println("3:BACK  4:HOME");
                        break;
                    case 3:
                        System.out.println("1:Buy Once ");
                        System.out.println("2:Auto Renew");
                        System.out.println("3:BACK  4:HOME");
                        break;
                    case 4:
                        System.out.println("1: Buy Once ");
                        System.out.println("2: Auto Renew");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 5:
                        System.out.println("1:Buy Once");
                        System.out.println("2:Auto Renew");
                        System.out.println("3: BACK  4:HOME");
                        break;
                    case 6:
                        System.out.println("1:Buy Power Hour 250MB@ Sh19 using:");
                        System.out.println("2:Airtime");
                        System.out.println("3:MPESA");
                        System.out.println("4: BACK  5:HOME");
                    default:
                        System.out.println("Invalid option.");
                }
                ///sub meu of option3 WEEKLY Deals
            case 5:
                System.out.println("1:250MB@Sh50");
                System.out.println("2:750MB + WhatsApp@Sh100");
                System.out.println("2:2GB + WhatsApp@Sh250");
                System.out.println("2:4GB + WhatsApp@Sh500");
                System.out.println("3: BACK  4:HOME");

                int innerChoiceII = scanner.nextInt();
                switch (innerChoiceII) {
                    case 1:
                        System.out.println("Buy 250MB@Sh50 using:");
                        System.out.println("2:Airtime");
                        System.out.println("3:MPESA");
                        System.out.println("4:Bonga (100points)");
                        System.out.println("5: BACK  6:HOME");
                        break;
                    case 2:
                        System.out.println("Buy 750MB + WhatsApp@Sh100 using:");
                        System.out.println("2:Airtime");
                        System.out.println("3:MPESA");
                        System.out.println("4:Bonga (100points)");
                        System.out.println("5: BACK  6:HOME");
                        break;
                    case 3:
                        System.out.println("Buy 2GB + WhatsApp@Sh250 using:");
                        System.out.println("2:Airtime");
                        System.out.println("3:MPESA");
                        System.out.println("4:Bonga (100points)");
                        System.out.println("5: BACK  6:HOME");
                        break;
                    case 4:
                        System.out.println("Buy 4GB + WhatsApp@Sh500 using:");
                        System.out.println("2:Airtime");
                        System.out.println("3:MPESA");
                        System.out.println("4:Bonga (100points)");
                        System.out.println("5: BACK  6:HOME");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();


    }
}