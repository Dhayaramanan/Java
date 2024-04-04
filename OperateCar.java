public interface OperateCar {
    int turn(Direction direction,
        double radius,
        double startSpeed,
        double endSpeed);

    int changeLanes(Direction direction,
        double startSpeed,
        double endSpeed);
    double speedLimit = 60;
}