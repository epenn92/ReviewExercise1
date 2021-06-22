package com.test;

import java.io.Serializable;

public class ReadInputTest implements Serializable {
	
		private int testNo;
		private transient String testName;
		
		public ReadInputTest(int testNo, String testName) {
			super();
			this.testNo = testNo;
			this.testName = testName;
		}

		public ReadInputTest(ReadInputTest test) {
			this.testNo = test.testNo;
			this.testName = test.testName;
		}

		@Override
		public String toString() {
			return "ReadInputTest [testNo=" + testNo + ", testName=" + testName + "]";
		}

		public int getTestNo() {
			return testNo;
		}

		public void setTestNo(int testNo) {
			this.testNo = testNo;
		}

		public String getTestName() {
			return testName;
		}

		public void setTestName(String testName) {
			this.testName = testName;
		}
		
		
}
