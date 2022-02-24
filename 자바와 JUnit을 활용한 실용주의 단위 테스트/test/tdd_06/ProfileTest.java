package tdd_06;

import org.junit.jupiter.api.Test;

public class ProfileTest {

    @Test
    public void test() {
        Profile profile = new Profile("Supreme");
        Question question = new BooleanQuestion(1, "보너스 받았어?");

        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);

        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);

        System.out.println("criterion = " + criterion);
        System.out.println("criteria = " + criteria);
        System.out.println("criteriaAnswer = " + criteriaAnswer);
    }
}
