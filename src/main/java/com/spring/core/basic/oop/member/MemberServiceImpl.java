package com.spring.core.basic.oop.member;

// 회원 서비스 구현체
// 역할 : 적당한 회원 저장소에 CRUD 명령을 내리는 역할
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        // 해야할 일들 ~~~~~~~~~
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        Member findMember = memberRepository.findById(memberId);
        // 해야할 일들 ~~~~~~~~
        return findMember;
    }
    
}
