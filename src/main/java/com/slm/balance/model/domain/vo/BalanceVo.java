package com.slm.balance.model.domain.vo;

import java.util.List;

import com.slm.balance.model.domain.form.BalanceItemForm;

public class BalanceVo {

	public BalanceSummeryVo header;
	public List<BalanceItemForm> items;
	
    public BalanceSummeryVo getHeader() {
		return header;
	}

	public void setHeader(BalanceSummeryVo header) {
		this.header = header;
	}

	public List<BalanceItemForm> getItems() {
		return items;
	}

	public void setItems(List<BalanceItemForm> items) {
		this.items = items;
	}



	public int getTotal() {
        return 0;
    }

}