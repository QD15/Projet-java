public class Barman extends Organisation{
   private boolean ServirAlcool{
        if (super.age >= 18) {
            super.credits -= 1;
            return true;
        } else {
            return false;
    } 


}