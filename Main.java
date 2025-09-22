package BankingProject.bankingprojectg;

import java.util.Scanner;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String DIVIDER = "***************";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    int choice = 0;

        while (choice != 4) {
            logger.info(DIVIDER);
            logger.info("BANKING PROGRAM");
            logger.info(DIVIDER);
            logger.info("1. Show Balance");
            logger.info(DIVIDER);
            logger.info("2. Deposit");
            logger.info(DIVIDER);
            logger.info("3. Withdraw");
            logger.info(DIVIDER);
            logger.info("4. Exit");
            logger.info(DIVIDER);

            logger.info("Enter your choice (1-4): ");
            if (!scanner.hasNextInt()) {
                logger.info("INVALID INPUT - please enter a number between 1 and 4");
                scanner.next(); // consume invalid token
                continue;
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    logger.info("SHOW BALANCE");
                    break;
                case 2:
                    logger.info("DEPOSIT");
                    break;
                case 3:
                    logger.info("WITHDRAW");
                    break;
                case 4:
                    logger.info("Exiting...");
                    break;
                default:
                    logger.info("INVALID CHOICE");
                    break;
            }
        }


        // GET AND PROCESS USERS CHOICE

        // showBalance()

        // deposit()

        // withdraw()

        // EXIT MESSAGE

        scanner.close();
    }
    
}
