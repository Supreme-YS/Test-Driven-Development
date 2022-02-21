package tdd_01;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.*;

class ScoreCollectionTest {

    @Test
    public void 덧셈_테스트를_해보자() {
        // 준비
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        // 실행
        int result = scoreCollection.arithmeticMean();

        // 단언
        assertThat(result, equalTo(6));
    }
}