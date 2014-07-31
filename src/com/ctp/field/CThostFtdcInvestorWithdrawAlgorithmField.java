/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcInvestorWithdrawAlgorithmField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcInvestorWithdrawAlgorithmField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInvestorWithdrawAlgorithmField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcInvestorWithdrawAlgorithmField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr,
				this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(
				swigCPtr, this, value);
	}

	public char getInvestorRange() {
		return CtpJNI
				.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(
						swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_set(
				swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_get(
				swigCPtr, this);
	}

	public void setUsingRatio(double value) {
		CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(
				swigCPtr, this, value);
	}

	public double getUsingRatio() {
		return CtpJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(
				swigCPtr, this);
	}

	public CThostFtdcInvestorWithdrawAlgorithmField() {
		this(CtpJNI.new_CThostFtdcInvestorWithdrawAlgorithmField(), true);
	}

}