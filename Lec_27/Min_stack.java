package Lec_27;

public class Min_stack extends Dynamic_Stack {
	int min = 0;

	public int min() {
		return min;
	}

	@Override
	public int peek() {
		if (arr[tos] >= min) {
			return arr[tos];
		} else {
			return min;
		}
	}

	@Override
	public void push(int ali) {
		if(this.isEmpty()) {
			min = ali;
		}
		
		if (ali >= min) {
			super.push(ali);
		} else {
//			Store glitch!
			int prev_min = min;
			min = ali;
			int X = 2 * min - prev_min;
			super.push(X);
		}
	}

	@Override
	public int pop() throws Exception {
		if(arr[tos]>=min) {
			return super.pop();
		}else {
//			If glitch!!
			int X = super.pop();
			int prev_min = 2*min-X;
			
			int ans = min;
			
			min = prev_min;
			return ans;
		}
	}
}
