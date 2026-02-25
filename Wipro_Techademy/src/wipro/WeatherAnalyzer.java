package wipro;

import java.util.Scanner;

class weatherRecord
{
    String city;
    float temp;

    weatherRecord(String city, float temp)
    {
        this.city = city;
        this.temp = temp;
    }
}

public class WeatherAnalyzer
{
    public static String checkTemp(float temp)
    {
        final int thresHold = 30;
        boolean isHot = false;

        if (temp > thresHold) {
            isHot = true;
        }

        if (isHot == true) {
            return "Hot Day";
        } else {
            return "Cold Day";
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ener the City Name:");
        String city = sc.nextLine();

        System.out.println("Ener the Temperature of " + city + ":");
        float temp = sc.nextFloat();

        weatherRecord record = new weatherRecord(city, temp);

        String weatherCheck = checkTemp(temp);

        System.out.println("City: " + record.city);
        System.out.println("Temperature: " + record.temp + "°C");
        System.out.println("Condition: " + weatherCheck);

        record = null;
    }
}
