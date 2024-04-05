public class ConvertTemperature {

    public String convert(double tem, String scale)
    {

        switch(scale)
        {
            case "fahrenheit":
                return new String(String.valueOf((tem-32)*5/9));
            case "celsius":
                return new String(String.valueOf((tem*9/5)+32));
            case "kelvin":
                return  new String(String.valueOf(tem- 273.15));
            default :
                return ("Please enter the scale of the temperature (Fahrenheit, Celsius, or Kelvin):");


        }

    }

}
