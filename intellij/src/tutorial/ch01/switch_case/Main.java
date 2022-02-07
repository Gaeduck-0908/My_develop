package tutorial.ch01.switch_case;

public class Main {
	public static void main(String[] args) {
		// 게임 레벨
		final int LEVEL_1_BASIC = 1;
		final int LEVEL_2_RUNNER = 2;
		final int LEVEL_3_FLY = 3;

		int level = 0;
		switch(level) {
			case LEVEL_1_BASIC : case LEVEL_2_RUNNER:
				System.out.println("레벨 1입니다. 초보 환영 :)");
				System.out.println("레벨 2입니다. 나는 달릴 수 있어요!");
				break;
			case LEVEL_3_FLY:
				System.out.println("레벨 3입니다. 나는 날 수 있어요~~~!!");
				break;
			default:
				break;
		}


		int month = 2;
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println(month + "월은 31일까지 있어요");
			}
			case 4, 6, 9, 11 -> {
				System.out.println(month + "월은 30일까지 있어요");
			}
			case 2 -> {
				System.out.println(month + "월은 28까지 있어요");
			}
			default -> {
			}
		}












	}
}
















