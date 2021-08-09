package java2.Lesson_1;


public class Main {
    public static void main(String[] args) {
        JumpRun[] members = {
                new Human(2, 2, "Alex"),
                new Human(1, 2, "Alena"),
                new Cat(3, 4, "Barsik"),
                new Cat(1, 1, "Basya"),
                new Robot(0, 10, 10),
                new Robot(4,7,12)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpRun member : members) {
            System.out.println("Начинает проходить " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " проходит " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("Успех");
                } else {
                    winner = false;
                    System.out.println("Неудача");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " Победил");
            } else {
                System.out.println(member + " Проиграл");
            }
            System.out.println();
        }
    }
}