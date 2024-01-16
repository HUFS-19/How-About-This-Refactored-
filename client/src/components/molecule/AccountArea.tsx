import Button from '../atom/Button';
import styled from 'styled-components';

const AccountArea = () => {
  return (
    <StyledAccountArea>
      <Button
        id='LoginBtn'
        text='로그인'
        color='black'
        width='130px'
        height='35px'
      />
      <Button
        id='JoinBtn'
        text='회원가입'
        color='white'
        width='130px'
        height='35px'
      />
    </StyledAccountArea>
  );
};

export const StyledAccountArea = styled.div``;

export default AccountArea;
