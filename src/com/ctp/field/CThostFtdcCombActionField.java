/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcCombActionField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcCombActionField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcCombActionField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcCombActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcCombActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID()
	{
		return ctpJNI.CThostFtdcCombActionField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcCombActionField_InstrumentID_get(swigCPtr, this);
	}

	public void setCombActionRef(String value)
	{
		ctpJNI.CThostFtdcCombActionField_CombActionRef_set(swigCPtr, this, value);
	}

	public String getCombActionRef()
	{
		return ctpJNI.CThostFtdcCombActionField_CombActionRef_get(swigCPtr, this);
	}

	public void setUserID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID()
	{
		return ctpJNI.CThostFtdcCombActionField_UserID_get(swigCPtr, this);
	}

	public void setDirection(char value)
	{
		ctpJNI.CThostFtdcCombActionField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection()
	{
		return ctpJNI.CThostFtdcCombActionField_Direction_get(swigCPtr, this);
	}

	public void setVolume(int value)
	{
		ctpJNI.CThostFtdcCombActionField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume()
	{
		return ctpJNI.CThostFtdcCombActionField_Volume_get(swigCPtr, this);
	}

	public void setCombDirection(char value)
	{
		ctpJNI.CThostFtdcCombActionField_CombDirection_set(swigCPtr, this, value);
	}

	public char getCombDirection()
	{
		return ctpJNI.CThostFtdcCombActionField_CombDirection_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value)
	{
		ctpJNI.CThostFtdcCombActionField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag()
	{
		return ctpJNI.CThostFtdcCombActionField_HedgeFlag_get(swigCPtr, this);
	}

	public void setActionLocalID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_ActionLocalID_set(swigCPtr, this, value);
	}

	public String getActionLocalID()
	{
		return ctpJNI.CThostFtdcCombActionField_ActionLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcCombActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID()
	{
		return ctpJNI.CThostFtdcCombActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID()
	{
		return ctpJNI.CThostFtdcCombActionField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID()
	{
		return ctpJNI.CThostFtdcCombActionField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value)
	{
		ctpJNI.CThostFtdcCombActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID()
	{
		return ctpJNI.CThostFtdcCombActionField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value)
	{
		ctpJNI.CThostFtdcCombActionField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID()
	{
		return ctpJNI.CThostFtdcCombActionField_InstallID_get(swigCPtr, this);
	}

	public void setActionStatus(char value)
	{
		ctpJNI.CThostFtdcCombActionField_ActionStatus_set(swigCPtr, this, value);
	}

	public char getActionStatus()
	{
		return ctpJNI.CThostFtdcCombActionField_ActionStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value)
	{
		ctpJNI.CThostFtdcCombActionField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence()
	{
		return ctpJNI.CThostFtdcCombActionField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcCombActionField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcCombActionField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value)
	{
		ctpJNI.CThostFtdcCombActionField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID()
	{
		return ctpJNI.CThostFtdcCombActionField_SettlementID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value)
	{
		ctpJNI.CThostFtdcCombActionField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo()
	{
		return ctpJNI.CThostFtdcCombActionField_SequenceNo_get(swigCPtr, this);
	}

	public void setFrontID(int value)
	{
		ctpJNI.CThostFtdcCombActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID()
	{
		return ctpJNI.CThostFtdcCombActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value)
	{
		ctpJNI.CThostFtdcCombActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID()
	{
		return ctpJNI.CThostFtdcCombActionField_SessionID_get(swigCPtr, this);
	}

	public void setUserProductInfo(String value)
	{
		ctpJNI.CThostFtdcCombActionField_UserProductInfo_set(swigCPtr, this, value);
	}

	public String getUserProductInfo()
	{
		return ctpJNI.CThostFtdcCombActionField_UserProductInfo_get(swigCPtr, this);
	}

	public void setStatusMsg(String value)
	{
		ctpJNI.CThostFtdcCombActionField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg()
	{
		return ctpJNI.CThostFtdcCombActionField_StatusMsg_get(swigCPtr, this);
	}

	public CThostFtdcCombActionField()
	{
		this(ctpJNI.new_CThostFtdcCombActionField(), true);
	}
}
