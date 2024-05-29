package com.epb.amos.bean;

import java.util.List;
import java.util.Optional;

import com.epb.amos.entity.MldmasView;
import com.epb.amos.entity.MlmasDespatchView;

public class MldmasViewInfo {

	private Optional<MldmasView> mldmasView;
	private List<MlmasDespatchView> mlmasDespatchView;

	public MldmasViewInfo() {
		super();
	}

	public MldmasViewInfo(Optional<MldmasView> mldmasView, List<MlmasDespatchView> mlmasDespatchView) {
		super();
		this.mldmasView = mldmasView;
		this.mlmasDespatchView = mlmasDespatchView;
	}

	public Optional<MldmasView> getMldmasView() {
		return mldmasView;
	}

	public void setMldmasView(Optional<MldmasView> mldmasView) {
		this.mldmasView = mldmasView;
	}

	public List<MlmasDespatchView> getMlmasDespatchView() {
		return mlmasDespatchView;
	}

	public void setMlmasDespatchView(List<MlmasDespatchView> mlmasDespatchView) {
		this.mlmasDespatchView = mlmasDespatchView;
	}

}
