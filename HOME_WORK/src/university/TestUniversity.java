package university;

import org.junit.jupiter.api.Test;
public class TestUniversity {
@Test
public void testUniversity() {
    University university = new University();
    ImportantUniversity important = new ImportantUniversity();
    university.enterRule(0, 100, 20);
    important.enterRule(-50, 100, -100);
}
}