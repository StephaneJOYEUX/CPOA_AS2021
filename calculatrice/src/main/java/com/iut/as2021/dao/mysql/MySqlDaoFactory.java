package com.iut.as2021.dao.mysql;

import com.iut.as2021.dao.DaoFactory;
import com.iut.as2021.dao.IDaoMathResult;

public class MySqlDaoFactory extends DaoFactory {

	@Override
	public IDaoMathResult getDaoMathResult() {
		return MySqlDao.getInstance();
	}
}
