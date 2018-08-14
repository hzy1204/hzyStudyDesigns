package cn.hzy.structurePattern.facade;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup(){
		System.out.println("电脑开机了。。。");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("开机成功。。。");
	}
	
	public void shutdown() {
		System.out.println("电脑关机了。。。");
		cpu.shoutdown();
		memory.shoutdown();
		disk.shoutdown();
		System.out.println("关机成功。。。");
	}

}
