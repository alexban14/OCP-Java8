public class SwitchEnums {
    public enum Season {
        WINER, SPRING, SUMMER, FALL
    }

    Season summer = Season.SUMMER;
    switch (summer) {
        case WINTER:
            System.out.println("Get out the sled!");
             break;
        case SUMMER:
            System.out.println("Time for the pool!");
            break;
        default:
            System.out.println("Is it summer yet?");
    }
}
