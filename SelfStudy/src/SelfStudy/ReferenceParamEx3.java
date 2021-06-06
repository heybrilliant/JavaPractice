package SelfStudy;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

		printArr(arr); // �迭�� ��� ��Ҹ� ���
		sortArr(arr); // �迭�� ����
		printArr(arr); // ������ �ٽ� �迭�� ��� ��Ҹ� ���
		System.out.println("sum = " + sumArr(arr));
	}

	static void printArr(int[] arr) { // �迭�� ��� ��Ҹ� ���
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	static void sortArr(int[] arr) { // �迭�� ������������ ����
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	static int sumArr(int[] arr) { // �迭�� ��� ����� ���� ��ȯ
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum += arr[i];
		}
		return sum;

	}
}
