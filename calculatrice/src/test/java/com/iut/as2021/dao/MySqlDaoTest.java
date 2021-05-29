package com.iut.as2021.dao;

import static com.iut.as2021.dao.DaoFactory.getDAOFactory;
import static com.iut.as2021.dao.ETypeDao.MYSQL;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.iut.as2021.dao.mysql.MySqlDao;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;

public class MySqlDaoTest {

	// Sans mockito :
	private IDaoMathResult dao;

	// Avec Mockito
	private MySqlDao daoMock;

	@Before
	public void setUp() {
		dao = getDAOFactory(MYSQL).getDaoMathResult();
		daoMock = Mockito.mock(MySqlDao.class);
	}

	@Test
	public void testReadById() throws MathsExceptions {
		MathResultat resultat = dao.readyById(1);
		assertEquals(resultat.getValue(), 5, 0);
	}

	@Test
	public void testReadByIdWithMock() throws MathsExceptions {
		MathResultat resultat = new MathResultat("2+3");
		Mockito.when(daoMock.readyById(anyInt())).thenReturn(resultat);
		assertEquals(resultat.getValue(), 5, 0);
	}
}
