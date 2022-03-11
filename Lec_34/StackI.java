package Lec_34;

public interface StackI  {
	int version = 1; // static and final!!

	int pop();

	void add(int ali);

	void disp();

	int peek();

	int size();

	void rev();

	int find(int ali);

	boolean contains(int ali);

}
