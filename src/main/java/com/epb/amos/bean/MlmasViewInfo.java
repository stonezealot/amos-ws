package com.epb.amos.bean;

import java.util.List;
import java.util.Optional;

import com.epb.amos.entity.MldmasView;
import com.epb.amos.entity.MlmasView;

public class MlmasViewInfo {

	private Optional<MlmasView> mlmasView;
	private List<MldmasView> mldmasView;

	public MlmasViewInfo() {
		super();
	}

	public MlmasViewInfo(Optional<MlmasView> mlmasView, List<MldmasView> mldmasView) {
		super();
		this.mlmasView = mlmasView;
		this.mldmasView = mldmasView;
	}

	public Optional<MlmasView> getMlmasView() {
		return mlmasView;
	}

	public void setMlmasView(Optional<MlmasView> mlmasView) {
		this.mlmasView = mlmasView;
	}

	public List<MldmasView> getMldmasView() {
		return mldmasView;
	}

	public void setMldmasView(List<MldmasView> mldmasView) {
		this.mldmasView = mldmasView;
	}

}
