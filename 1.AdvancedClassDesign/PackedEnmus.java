public class PackedEnums {
    public enum Season {
        WINTER {
            public void printHours() { System.out.println("9am-3pm"); }
        }, SUMMER {
            public void printHours() { System.out.println("9am-7pm"); }
        }, FALL, SPRING {
            public void printHours() { System.out.println("9am-5pm"); }
        };
        public abstract void printHours();
    }   
}
