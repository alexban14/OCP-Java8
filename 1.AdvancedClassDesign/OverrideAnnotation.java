public class OverrideAnnotation {
    class Bobcat {
        public void findDen() { }
    }

    class BobcatMother extends Bobcat {
        @Override
        public void findDen() { }
    }
}
