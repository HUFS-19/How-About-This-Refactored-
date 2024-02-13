import styled from 'styled-components';
import Button from '../atom/Button';

const JoinBtns = () => {
  return (
    <StyledLoginBtns>
      <Button text='가입하기' color='grey' width='200px' height='40px' />
    </StyledLoginBtns>
  );
};

export const StyledLoginBtns = styled.div``;

export default JoinBtns;
