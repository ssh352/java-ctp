/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcExchangeOrderActionField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcExchangeOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ExchangeID_set(swigCPtr,
				this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ExchangeID_get(
				swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_OrderSysID_set(swigCPtr,
				this, value);
	}

	public String getOrderSysID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_OrderSysID_get(
				swigCPtr, this);
	}

	public void setActionFlag(char value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ActionFlag_set(swigCPtr,
				this, value);
	}

	public char getActionFlag() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ActionFlag_get(
				swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_LimitPrice_set(swigCPtr,
				this, value);
	}

	public double getLimitPrice() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_LimitPrice_get(
				swigCPtr, this);
	}

	public void setVolumeChange(int value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_VolumeChange_set(swigCPtr,
				this, value);
	}

	public int getVolumeChange() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_VolumeChange_get(
				swigCPtr, this);
	}

	public void setActionDate(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ActionDate_set(swigCPtr,
				this, value);
	}

	public String getActionDate() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ActionDate_get(
				swigCPtr, this);
	}

	public void setActionTime(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ActionTime_set(swigCPtr,
				this, value);
	}

	public String getActionTime() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ActionTime_get(
				swigCPtr, this);
	}

	public void setTraderID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_TraderID_set(swigCPtr, this,
				value);
	}

	public String getTraderID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_TraderID_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_InstallID_get(
				swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_set(swigCPtr,
				this, value);
	}

	public String getOrderLocalID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_OrderLocalID_get(
				swigCPtr, this);
	}

	public void setActionLocalID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_set(swigCPtr,
				this, value);
	}

	public String getActionLocalID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ActionLocalID_get(
				swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ParticipantID_set(swigCPtr,
				this, value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ParticipantID_get(
				swigCPtr, this);
	}

	public void setClientID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_ClientID_set(swigCPtr, this,
				value);
	}

	public String getClientID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_ClientID_get(swigCPtr,
				this);
	}

	public void setBusinessUnit(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_set(swigCPtr,
				this, value);
	}

	public String getBusinessUnit() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_BusinessUnit_get(
				swigCPtr, this);
	}

	public void setOrderActionStatus(char value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_set(
				swigCPtr, this, value);
	}

	public char getOrderActionStatus() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_OrderActionStatus_get(
				swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcExchangeOrderActionField_UserID_get(swigCPtr,
				this);
	}

	public CThostFtdcExchangeOrderActionField() {
		this(CtpJNI.new_CThostFtdcExchangeOrderActionField(), true);
	}

}