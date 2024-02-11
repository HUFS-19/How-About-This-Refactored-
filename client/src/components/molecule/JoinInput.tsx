import styled from 'styled-components';
import Button from '../atom/Button';
import JoinIdInput from '../atom/JoinIdInput';
import JoinPwdInput from '../atom/JoinPwdInput';

const JoinInput = () => {
  return (
    <StyledJoinInput>
      <JoinIdInput />
      <JoinPwdInput />
    </StyledJoinInput>
  );
};

export const StyledJoinInput = styled.div`
  text-align: left;
  margin: 10px 0 10px 0;
`;

export default JoinInput;
