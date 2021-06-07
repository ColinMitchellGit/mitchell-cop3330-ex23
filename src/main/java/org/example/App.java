/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String car_silent = input.nextLine();

        if(car_silent.equals("y") || car_silent.equals("Y")) {
            System.out.print("Are the battery terminals corroded? ");
            String terminals_corroded = input.nextLine();

            if(terminals_corroded.equals("y") || terminals_corroded.equals("Y")) {
                System.out.println("Clean terminals and try starting again.");
            }else if(terminals_corroded.equals("n") || terminals_corroded.equals("N")) {
                System.out.println("The battery cables may be damaged.\nReplace cables and try again.");
            }
        }else if(car_silent.equals("n") || car_silent.equals("N")) {
            System.out.print("Does the car make a slicking noise? ");
            String slicking_noise = input.nextLine();

            if(slicking_noise.equals("y") || slicking_noise.equals("Y")) {
                System.out.println("Replace the battery.");
            }else if(slicking_noise.equals("n") || slicking_noise.equals("N")) {
                System.out.print("Does the car crank up but fail to start? ");
                String crank_fail = input.nextLine();

                if(crank_fail.equals("y") || crank_fail.equals("Y")) {
                    System.out.println("Check spark plug connections.");
                }else if(crank_fail.equals("n") || crank_fail.equals("N")) {
                    System.out.print("Does the engine start and then die? ");
                    String engine_start_die = input.nextLine();

                    if(engine_start_die.equals("y") || engine_start_die.equals("Y")) {
                        System.out.print("Does you car have fuel injection? ");
                        String fuel_injection = input.nextLine();

                        if(fuel_injection.equals("y") || fuel_injection.equals("Y")) {
                            System.out.println("Get it in for service.");
                        }else if(fuel_injection.equals("n") || fuel_injection.equals("N")) {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else if(engine_start_die.equals("n") || engine_start_die.equals("N")) {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
