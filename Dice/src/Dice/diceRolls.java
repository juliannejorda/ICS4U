package Dice;
/*Reine Julianne Jorda
 * Mr. Christian
 * ICS4U
 * 10 July 2019
 * U2A2 - Dice Rolls
 * Create a DiceRolls application that displays five rolls of two dice where each die is
numbered from 1 to 6. The application should also show the total of each roll. Your output should look 
like: 
                Dice 1      Dice 2    Total
                   5              6         11
                   4              3          7
                   2              1         3
                   6              6         12
                   3              6          9

 */
public class diceRolls {

public static void main(String[] args) {
//declaring values for each roll
int dice1FirstRoll = 5;
int dice2FirstRoll = 6;
int dice1SecondRoll = 4;
int dice2SecondRoll = 3;
int dice1ThirdRoll = 2;
int dice2ThirdRoll = 1;
int dice1FourthRoll = 6;
int dice2FourthRoll = 6;
int dice1FifthRoll = 3;
int dice2FifthRoll = 6;

//printing out the chart alongside the value of each roll
	System.out.format("%10s %10s %10s", "Dice 1", "Dice 2", "Total");
	System.out.format("\n %9s %10s %10s", dice1FirstRoll, dice2FirstRoll, dice1FirstRoll+dice2FirstRoll);
	System.out.format("\n %9s %10s %10s", dice1SecondRoll, dice2SecondRoll, dice1SecondRoll+dice2SecondRoll);
	System.out.format("\n %9s %10s %10s", dice1ThirdRoll, dice2ThirdRoll, dice1ThirdRoll+dice2ThirdRoll);
	System.out.format("\n %9s %10s %10s", dice1FourthRoll, dice2FourthRoll, dice1FourthRoll+dice2FourthRoll);
	System.out.format("\n %9s %10s %10s", dice1FifthRoll, dice2FifthRoll, dice1FifthRoll+dice2FifthRoll);
	}

}
