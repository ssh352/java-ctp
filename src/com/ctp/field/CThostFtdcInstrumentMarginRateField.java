/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcInstrumentMarginRateField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInstrumentMarginRateField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcInstrumentMarginRateField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_get(
				swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_set(swigCPtr,
				this, value);
	}

	public char getInvestorRange() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_get(
				swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_InvestorID_set(swigCPtr,
				this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_InvestorID_get(
				swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_set(swigCPtr,
				this, value);
	}

	public char getHedgeFlag() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_get(
				swigCPtr, this);
	}

	public void setLongMarginRatioByMoney(double value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_set(
				swigCPtr, this, value);
	}

	public double getLongMarginRatioByMoney() {
		return CtpJNI
				.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_get(
						swigCPtr, this);
	}

	public void setLongMarginRatioByVolume(double value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_set(
				swigCPtr, this, value);
	}

	public double getLongMarginRatioByVolume() {
		return CtpJNI
				.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_get(
						swigCPtr, this);
	}

	public void setShortMarginRatioByMoney(double value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_set(
				swigCPtr, this, value);
	}

	public double getShortMarginRatioByMoney() {
		return CtpJNI
				.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_get(
						swigCPtr, this);
	}

	public void setShortMarginRatioByVolume(double value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_set(
				swigCPtr, this, value);
	}

	public double getShortMarginRatioByVolume() {
		return CtpJNI
				.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_get(
						swigCPtr, this);
	}

	public void setIsRelative(int value) {
		CtpJNI.CThostFtdcInstrumentMarginRateField_IsRelative_set(swigCPtr,
				this, value);
	}

	public int getIsRelative() {
		return CtpJNI.CThostFtdcInstrumentMarginRateField_IsRelative_get(
				swigCPtr, this);
	}

	public CThostFtdcInstrumentMarginRateField() {
		this(CtpJNI.new_CThostFtdcInstrumentMarginRateField(), true);
	}

}