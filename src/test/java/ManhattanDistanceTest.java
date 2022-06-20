import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ManhattanDistanceTest {

    @Test
    void fail() {
        Point p1 = new Point(10 , 5);
        Point p2 = new Point(2 , 3);
        assertThat(ManhattanDistance.manhattanDistance(p1 , p2))
                .isEqualTo(8.2);

    }

    @Test
    void it_should_not_fail() {
        Point p1 = new Point(10 , 5);
        Point p2 = new Point(2 , 3);
        assertThat(ManhattanDistance.manhattanDistance(p1 , p2))
                .isEqualTo(10);
    }
}
