package chuji.class_03;

import java.util.LinkedList;
import java.util.Queue;

public class Code_04_DogCatQueue {	//猫狗队列

	public static class Pet {	//一.宠物类
		private String type;

		public Pet(String type) {	//构造方法，相当于setPet()方法
			this.type = type;
		}

		public String getPetType() {	//相当于get()方法
			return this.type;
		}
	}

	public static class Dog extends Pet {
		public Dog() {
			super("dog");	//继承父类构造方法
		}
	}

	public static class Cat extends Pet {
		public Cat() {
			super("cat");
		}
	}

	public static class PetEnterQueue {		//二.设置一个宠物进
		private Pet pet;	//判断是什么宠物
		private long count;	//计算进来宠物的个数

		public PetEnterQueue(Pet pet, long count) {
			this.pet = pet;
			this.count = count;
		}

		public Pet getPet() {
			return this.pet;
		}

		public long getCount() {
			return this.count;
		}

		public String getEnterPetType() {
			return this.pet.getPetType();
		}
	}

	public static class DogCatQueue {	//三.猫狗队列类
		private Queue<PetEnterQueue> dogQ;
		private Queue<PetEnterQueue> catQ;
		private long count;

		public DogCatQueue() {
			this.dogQ = new LinkedList<PetEnterQueue>();
			this.catQ = new LinkedList<PetEnterQueue>();
			this.count = 0;
		}

		public void add(Pet pet) {	//进队列
			if (pet.getPetType().equals("dog")) {
				this.dogQ.add(new PetEnterQueue(pet, this.count++));
			} else if (pet.getPetType().equals("cat")) {
				this.catQ.add(new PetEnterQueue(pet, this.count++));
			} else {
				throw new RuntimeException("err, not dog or cat");
			}
		}

		public Pet pollAll() {	//弹出所有的实例--意思是从猫狗两个队列里弹出其中一个，并不是把两个队列里的所有弹出来
			if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {	//1.都不为空的情况
				if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {	//谁小弹谁
					return this.dogQ.poll().getPet();
				} else {
					return this.catQ.poll().getPet();
				}
			} else if (!this.dogQ.isEmpty()) {	//2.狗不为空的情况
				return this.dogQ.poll().getPet();
			} else if (!this.catQ.isEmpty()) {	//3.猫不为空的情况
				return this.catQ.poll().getPet();
			} else {	//4.都为空的情况
				throw new RuntimeException("err, queue is empty!");
			}
		}

		public Dog pollDog() {	//弹出中dog类的实例
			if (!this.isDogQueueEmpty()) {
				return (Dog) this.dogQ.poll().getPet();
			} else {
				throw new RuntimeException("Dog queue is empty!");
			}
		}

		public Cat pollCat() {	//弹出中cat类的实例
			if (!this.isCatQueueEmpty()) {
				return (Cat) this.catQ.poll().getPet();
			} else
				throw new RuntimeException("Cat queue is empty!");
		}

		public boolean isEmpty() {
			return this.dogQ.isEmpty() && this.catQ.isEmpty();
		}

		public boolean isDogQueueEmpty() {
			return this.dogQ.isEmpty();
		}

		public boolean isCatQueueEmpty() {
			return this.catQ.isEmpty();
		}

	}

	public static void main(String[] args) {
		DogCatQueue test = new DogCatQueue();

		Pet dog1 = new Dog();
		Pet cat1 = new Cat();
		Pet dog2 = new Dog();
		Pet cat2 = new Cat();
		Pet dog3 = new Dog();
		Pet cat3 = new Cat();

		test.add(dog1);
		test.add(cat1);
		test.add(dog2);
		test.add(cat2);
		test.add(dog3);
		test.add(cat3);

		test.add(dog1);
		test.add(cat1);
		test.add(dog2);
		test.add(cat2);
		test.add(dog3);
		test.add(cat3);

		test.add(dog1);
		test.add(cat1);
		test.add(dog2);
		test.add(cat2);
		test.add(dog3);
		test.add(cat3);
		while (!test.isDogQueueEmpty()) {
			System.out.println(test.pollDog().getPetType());
		}
		while (!test.isEmpty()) {
			System.out.println(test.pollAll().getPetType());
		}
	}

}
