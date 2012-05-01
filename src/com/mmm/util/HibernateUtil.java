package com.mmm.util;

import com.mmm.entity.Member;
import com.mmm.entity.Operation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * @author galimru
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure()
                    .addAnnotatedClass(Member.class)
                    .addAnnotatedClass(Operation.class)
                    .buildSessionFactory();
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @SuppressWarnings({"unchecked"})
    public static List<Member> getMemberList() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        List<Member> memberList = (List<Member>)session.createCriteria(Member.class).list();
        session.getTransaction().commit();
        session.close();
        return memberList;
    }

    public static void addMember(Member member) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();
        session.close();
    }
}
